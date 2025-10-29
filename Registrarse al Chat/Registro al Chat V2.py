import random

def generarNombreUsuario():
    return f"Usuario_{random.randint(100, 999)}"

def obtenerNombreUsuario():
    nombre = input("Ingresa tu nombre o pulsa ENTER para generar uno automático: ").strip()
    if not nombre:
        nombre = generarNombreUsuario()
    print(f"\n✅ Bienvenido al chat, Zorro {nombre}!")
    print(f"\n✅ Creo que deberias irte del Chat, {nombre}")
    return nombre

if __name__ == "__main__":
    obtenerNombreUsuario()