import json
import xmltodict


def data_deserialization(file):
    with open(file, "r") as read_file:
        f = read_file.read()

    return f


json_data = json.loads(data_deserialization("data_file.json"))
xml_string = xmltodict.unparse(json_data, pretty=True)
print(xml_string)
