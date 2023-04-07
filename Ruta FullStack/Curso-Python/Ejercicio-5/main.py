def es_bisiesto(year):
    """
    Determina si un año es bisiesto o no.
    """
    if year % 4 != 0:
        return False
    elif year % 100 != 0:
        return True
    elif year % 400 != 0:
        return False
    else:
        return True
    
year_input = int(input('Ingrese el año que desea saber si es bisiesto: '))

answer = ''.join(["El año ", str(year_input), " si es bisiesto." if es_bisiesto(year_input) else " no es bisiesto."])

print(answer)