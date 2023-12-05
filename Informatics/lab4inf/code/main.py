# option number: 30
# JSON -> XML

import json

# исходные данные для заполнения JSON файла
data = {"schedule": {
    "lecture": {
        "lesson": "History",
        "lesson_type": "lecture",
        "start_time": "10:00",
        "end_time": "11:30",
        "mentor": "Vicherov"
    },
    "practice": {
        "lesson": "History",
        "lesson_type": "practice",
        "start_time": "11:40",
        "end_time": "13:10",
        "mentor": "Vicherov"
    }
}
}


# сериализация данных в json файл
def data_serialization(file, data):
    # data serialization
    with open(file, "w") as write_file:
        json.dump(data, write_file, indent=4)


# десериализация данных из json файла с помощью библиотеки
def data_deserialization(file):
    with open(file, "r") as read_file:
        f = read_file.read()
    f = eval("".join(f.split()))

    return f


# функция для одновременной сериализации и десериализации json файла
def data_initialization(file, data):
    data_serialization(file, data)
    return data_deserialization(file)



def json_to_xml_meta(d, t=0):  # функция для создания xml строки из словаря
    s = ""
    for key, value in d.items():
        if isinstance(value, dict):
            s += ("\t" * t) + ("<" + key + ">") + "\n"
            s += json_to_xml_meta(value, t + 1)
            s += ("\t" * t) + ("</" + key + ">") + "\n"
        else:
            s += ("\t" * t) + ("<" + key + ">" + value + "</" + key + ">") + "\n"
    return s

def write_xml(json_file, xml_file):  # функция для записывания строки в xml файл
    s = json_to_xml_meta(data_deserialization(json_file))
    with open(xml_file, "w") as write_file:
        write_file.write(s)

data_initialization("data_file.json", data)

write_xml("data_file.json", "data_file.xml")





