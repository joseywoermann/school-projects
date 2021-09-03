// https://gist.github.com/joseywoermann/ea15be3f64fe093fcca1712744836141
public class Wuerfel {

    /**
     * Eine zufällige ganze Zahl zwischen 0 und der angegebenen Seitenzahl generieren.
     */
    public static int wuerfeln(int pSeitenzahl) {
        return (int) Math.round(Math.random() * (pSeitenzahl - 0));
    }
}
