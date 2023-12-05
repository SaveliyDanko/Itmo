import time


def data_deserialization(file):
    with open(file, "r") as read_file:
        f = read_file.read()
    f = eval("".join(f.split()))

    return f


def changer(json_file):
    s = str(data_deserialization(json_file))
    s = s.replace("\'", "\"")
    s = s.replace("{", "<root>\n", 1) \
        .replace("\"schedule\": {", "\t<schedule>\n", 1) \
        .replace("\"lecture\": {", "\t\t<lecture>\n", 1) \
        .replace("\"lesson\": \"History\",", "\t\t\t<lesson>History</lesson>\n", 1) \
        .replace("\"lesson_type\": \"lecture\",", "\t\t\t<lesson_type>lecture</lesson_type>\n", 1) \
        .replace("\"start_time\": \"10:00\",", "\t\t\t<start_time>10:00</start_time>\n", 1) \
        .replace("\"end_time\": \"11:30\",", "\t\t\t<end_time>11:30</end_time>\n", 1) \
        .replace("\"mentor\": \"Vicherov\"", "\t\t\t<mentor>Vicherov</mentor>\n", 1) \
        .replace("},", "\t\t</lecture>\n") \
        .replace("\"practice\": {", "\t\t<practice>\n") \
        .replace("\"lesson\": \"History\",", "\t\t\t<lesson>History</lesson>\n", 1) \
        .replace("\"lesson_type\": \"practice\",", "\t\t\t<lesson_type>lecture</lesson_type>\n", 1) \
        .replace("\"start_time\": \"11:40\",", "\t\t\t<start_time>11:40</start_time>\n", 1) \
        .replace("\"end_time\": \"13:10\",", "\t\t\t<end_time>13:10</end_time>\n", 1) \
        .replace("\"mentor\": \"Vicherov\"", "\t\t\t<mentor>Vicherov</mentor>\n", 1) \
        .replace("}", "\t\t</practice>\n", 1) \
        .replace("}", "\t</schedule>\n", 1) \
        .replace("}", "</root>")

    s = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" + s
    return s


def write_xml(json_file, xml_file):  # функция для записывания строки в xml файл
    s = changer(json_file)
    with open(xml_file, "w") as write_file:
        write_file.write(s)


write_xml("data_file.json", "data_file.xml")


def time_extent(json_file, xml_file):
    start_time = time.time()

    for i in range(100000):
        write_xml(json_file, xml_file)

    end_time = time.time()

    return end_time - start_time


write_xml("data_file.json", "data_file.xml")

print(time_extent("test_data.json", "data_file.xml"))
