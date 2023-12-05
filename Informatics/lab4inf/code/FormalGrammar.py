import time

def json_to_xml(data, pref="", t=1):
    s = ""
    if isinstance(data, dict):
        for key1, value1 in data.items():
            if (type(value1) != dict) and (type(value1) != list):
                value1 = str(value1)
                s += ("\t" * t) + ("<" + key1 + ">" + value1 + "</" + key1 + ">") + "\n"
            elif isinstance(value1, dict):
                s += ("\t" * t) + "<" + key1 + ">" + "\n"
                s += json_to_xml(value1, key1, t + 1)
                s += ("\t" * t) + "</" + key1 + ">" + "\n"
            elif isinstance(value1, list):
                s += json_to_xml(value1, key1, t)
    elif isinstance(data, list):
        for i in data:
            if isinstance(i, str):
                s += "\t" * t + "<" + pref + ">" + str(i) + "</" + pref + ">" + "\n"
            elif isinstance(i, dict):
                s += ("\t" * t) + "<" + pref + ">" + "\n"
                s += json_to_xml(i, pref, t + 1)
                s += ("\t" * t) + "</" + pref + ">" + "\n"
            elif isinstance(i, list):
                s += json_to_xml(i, "", t + 1)

    return s


def true_null_exeptor(s):
    s = s.replace(" true ", "True").replace(":true", ":True").replace("true,", "True,")
    s = s.replace(" null ", "None").replace(":null", ":None").replace("null,", "None,")

    return s

def data_deserialization(file):
    with open(file, "r") as read_file:
        f = read_file.read()
    f = true_null_exeptor(f)
    f = eval("".join(f.split()))

    return f


def write_xml(json_file, xml_file):  # функция для записывания строки в xml файл
    s = json_to_xml(data_deserialization(json_file))
    s = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" + "<root>" + "\n" + s + "</root>"
    with open(xml_file, "w") as write_file:
        write_file.write(s)


write_xml("data_file.json", "data_file.xml")
def time_extent(json_file, xml_file):
    start_time = time.time()

    for i in range(100000):
        write_xml(json_file, xml_file)

    end_time = time.time()

    return end_time - start_time




write_xml("test_data.json", "data_file.xml")


