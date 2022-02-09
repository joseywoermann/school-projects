def tupelListeAusText(text):

    # erzeugt aus einem String mit Zeilenumbruchzeichen
    # eine Liste mit Tupeln zu den einzelnen Datensaetzen

    liste1 = text.split('\n')
    liste2 = []
    for element in liste1:
        hilf = element.split(',')
        name = hilf[0]
        vorname = hilf[1]
        strasse = hilf[2]
        plz = hilf[3]
        ort = hilf[4]
        datum = (name, vorname, strasse, plz, ort)
        liste2 = liste2 + [datum]
    return liste2


def textAusTupelListe(liste):

    # erzeugt aus einer Liste mit Tupeln einen String,
    # der alle Tupel der Liste mit Komma getrennt als String darstellt
    # und der diese Tupeldarstellungen mit dem Zeilenumbruchzeichen \n trennt.
    
    text = ''
    if len(liste) > 0:
        tupel = liste[0]
        textTupel = tupel[0]+','+tupel[1]+','+tupel[2]+','+tupel[3]+','+tupel[4]
        text = text + textTupel
        for tupel in liste[1:]:
            textTupel = tupel[0]+','+tupel[1]+','+tupel[2]+','+tupel[3]+','+tupel[4]
            text = text + '\n' + textTupel
    return text

def textAusDatei(dateiname):

    # lädt einen Text aus einer Datei und gibt sie als
    # Zeichenkette zurück
    # beachte: setzt die Codierung iso-8859-1 voraus
    
    datei = open(dateiname, 'r', encoding='iso-8859-1')
    text = datei.read()
    datei.close()
    return text

def textInDateiSpeichern(dateiname, text):

    # speichert eine Zeichenkette in einer Datei
    # beachte: benutzt die Codierung iso-8859-1
    
    datei = open(dateiname, 'w', encoding='iso-8859-1')
    datei.write(text)
    datei.close()

