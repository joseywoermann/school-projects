public class Program {

    public static boolean linearsucheUnsortiert(int pQuery, int[] pData) {

        for (int i = 0; i < pData.length; i++) {
            if (pData[i] == pQuery) return true;
        }

        return false;
    }


    public static boolean linearsucheSortiert(int pQuery, int[] pData) {

        for (int i = 0; i < pData.length; i++) {
            if (pData[i] == pQuery) return true;
            if (pData[i] > pQuery) return false;
        }

        return false;
    }


    public static boolean binSuche(int pQuery, int[] pData) {

        boolean gefunden = false;

        int start = 0;
        int end = pData.length;

        while (!gefunden && start != end) {
            int middle = (end - start) / 2;

            if (pData[middle] == pQuery) {
                gefunden = true;
            } else if (pQuery < pData[middle]) {
                end = (middle - 1);
            } else {
                start = (middle + 1);
            }
        }

        return gefunden;
    }
}