from listenoperationen_zum_laden_und_speichern import *

# binäre Suche
def suchen(name, liste):
    indexErgebnis = -1
    gefunden = False
    links = 0
    rechts = len(liste)-1
    while not gefunden and links <= rechts:
        mitte = (links + rechts) // 2
        if name == liste[mitte][0]:
            gefunden = True
            indexErgebnis = mitte
        elif name < liste[mitte][0]:
            rechts = mitte-1
        else:
            links = mitte+1
    return indexErgebnis

# Test
text = textAusDatei('adressdaten_sortiert.csv')
listeDaten = tupelListeAusText(text)
index = suchen('Schmitt', listeDaten)
print(index)