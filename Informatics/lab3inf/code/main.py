import re

#isu = 408522

# №1: :-{O
with open("test1.txt")as f1:
    f1 = [i for i in f1.readlines()]

with open("test2.txt", encoding = "utf-8") as f2:
    f2 = [i for i in f2.readlines()]

with open("test3.txt") as f3:
    f3 = [i for i in f3.readlines()]


def test1(): #1, 2, 5, None, None
    for i in range(5):
        match = re.fidall(":-{O", f1[i])
        return (len(match) if match else "None")

def test2(): # Хайку; Не Хайку; Не Хайку; Не Хайку; Не Хайку
    t = "AУОЫИЭЯЮЁЕауоыиэяюёе"
    for i in range(len(f2)):
        match = bool(re.match(rf"([^{t}]*?[{t}]){{5}}[^{t}]*?/([^{t}]*?[{t}]){{7}}[^{t}]*?/([^{t}]*?[{t}]){{5}}[^{t}]*", f2[i]))
        print("Хайку" if match else "Не Хайку")

def test3():
    for i in range(len(f3)):
        f3[i] = re.sub(r"\d+[.,]\d+", "", f3[i])
        find = re.findall(r"(\d+)",f3[i])



        print(find)




test3()







