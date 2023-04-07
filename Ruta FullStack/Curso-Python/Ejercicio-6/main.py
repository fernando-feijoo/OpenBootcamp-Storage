class Vehiculo:
    color = "Rojo"
    ruedas = "Grandes"
    puertas = 5

class Coche(Vehiculo):
    velocidad = "300 km/h"
    cilindrada = "7.0"

c = Coche()

print("Color del Coche: ", c.color)
print("Ruedas del Coche: ", c.ruedas)
print("Puertas del Coche: ", c.puertas)
print("Velocidad del Coche: ", c.velocidad)
print("Cilindraje del Coche: ", c.cilindrada)