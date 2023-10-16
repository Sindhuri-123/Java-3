class Pangram {
    public static void allLetter(String str) {
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("String is a pangram");
        else
            System.out.println("String is not a pangram");
    }

    public static void main(String args[]) {
        String str = "Abcdefghijklmnopqrstuvwxyz12";
        allLetter(str);
    }
}