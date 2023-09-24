import json
filename = "C:\\Users\\LDA407\\IdeaProjects\\INFO2023-JAVA\\src\\tarea.json"

def c(x, o):
    content_file = f"{x['content_file']}"+"{/**"+f"{o}"+"*/}"
    with open(x["location_file"], 'w', encoding="utf8") as f:
        f.write(content_file)

def b(k, v):
    for j, o in v.items():
        name_file = "".join([a.capitalize() for a in j.split()])
        x = {
            "name_file": name_file,
            "location_file": f"C:\\Users\\LDA407\\IdeaProjects\\INFO2023-JAVA\\src\\{k.replace(' ', '_')}\\Tpn1\\{name_file}.java",
            "content_file": f"public class {name_file}"
        }
        c(x, o)

def a(data):
    for k, v in data.items():
        if dict(v): b(k, v)


with open(filename, 'r', encoding="utf8") as f: 
    data = json.load(f)
    a(data)