[[Mirror]](https://gist.github.com/joseywoermann/ee4a2ac73afe6bbf5a3bf83309d262cd)

# a)

Eine Liste ist eine lineare Datenstruktur, die eine variable, nicht festgelegte Länge hat, und jede beliebige Art von Objekten aufnehmen kann (generisch). Außerdem gibt es einen `Zeiger`, welcher es dem Nutzer erlaubt, auf jedes beliebige Element zuzugreifen. Jedes Element einer Liste ist eine `Node`, welche wie ein Container um das eigentliche Content-Objekt agiert. Zusätzlich bietet sie einen Verweis auf den Nachfolger.

#

Diese Datenstruktur eignet sich für den gegebenen Anwendungszweck gut, da im voraus nicht bekannt ist, wie viele LEDs die Lichterkette enthält (also fällt ein `Array` weg). Außerdem wird direkter Zugriff auf jedes einzelne Element benötigt, weshalb `Queue` & `Stack` nicht zur Verfügugn stehen.

-----

# b)

| LED                |
|--------------------|
| leuchtet: boolean  |
| + LED()            |
| + lichtAn(): void  |
| + lichtAus(): void |


| Steuerung                                       |
|-------------------------------------------------|
| anzahlLEDs: int                                 |
| lichterkette: List<LED>                         |
| + Steuerung()                                   |
| + leuchten01(): void                            |
| + leuchten02(): void                            |
| + leuchten03(): void                            |
| + lichterketteAnhaengen(List pLichtekette): void|
| + getAnzahlLEDs(): int                          |

-----

# e)

Um ein derartiges "Lichtergitter" zu steuern, muss das Programm durch jede einzelne Kette durchgehen. Um zum Beispeil die Methode `leuchten02()` umzusetzen, müsste man sich vorher überlegen, in welche Dimension man abzählen möchte.
