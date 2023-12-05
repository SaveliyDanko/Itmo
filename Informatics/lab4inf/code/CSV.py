import time


def data_deserialization(file):
    with open(file, "r") as read_file:
        f = read_file.read()
    f = eval("".join(f.split()))

    return f


def changer(json_file):
    s = str(data_deserialization(json_file))
    s = s.replace("\'", "\"")

    s = s.replace("{", "", 1) \
    .replace("\"schedule\": {", "shedule\n", 1) \
    .replace("\"lecture\": {", "lecture\n", 1) \
    .replace("\"lesson\": \"History\",", "lesson, History\n", 1) \
    .replace(" \"lesson_type\": \"lecture\",", "lesson_type, lecture\n", 1) \
    .replace(" \"start_time\": \"10:00\",", "start_time, 10:00\n", 1) \
    .replace(" \"end_time\": \"11:30\",", "end_time, 11:30\n", 1) \
    .replace(" \"mentor\": \"Vicherov\"", "mentor, Vicherov\n", 1) \
    .replace("},", "", 1) \
    .replace(" \"practice\": {", "practice\n", 1) \
    .replace("\"lesson\": \"History\",", "lesson, History\n", 1) \
    .replace(" \"lesson_type\": \"practice\",", "lesson_type, practice\n", 1) \
    .replace(" \"start_time\": \"11:40\",", "start_time, 11:40\n", 1) \
    .replace(" \"end_time\": \"13:10\",", "end_time, 13:10\n", 1) \
    .replace(" \"mentor\": \"Vicherov\"", "mentor, Vicherov\n", 1) \
    .replace("}", "")

    return s


def write_csv(json_file, csv_file):  # функция для записывания строки в xml файл
    s = changer(json_file)
    with open(csv_file, "w") as write_file:
        write_file.write(s)


write_csv("data_file.json", "data_file.csv")
