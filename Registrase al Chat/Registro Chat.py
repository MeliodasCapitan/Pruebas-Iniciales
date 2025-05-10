import random

def generar_nombre_usuario():
    return f"Usuario_{random.randint(100, 999)}"

def obtener_nombre_usuario():
    nombre = input("Ingresa tu nombre o pulsa ENTER para generar uno automático: ").strip()
    if not nombre:
        nombre = generar_nombre_usuario()
    print(f"\n✅ Bienvenido al chat, {nombre}!")
    return nombre

if __name__ == "__main__":
    obtener_nombre_usuario()
    