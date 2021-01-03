public class Stars {
    public void firstTask() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.println("*");
                } else {
                    System.out.print("*  ");
                }
            }
        }
    }

    public void secondTask() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 6 && j != 0) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
                if (j == 5) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public void thirdTask() {
        for (int i = 0; i < 7; i++) {
            for (int j = 6; j > i; j--) {
                if (i > 0 && j < 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("*");
        }
    }


    public void fourthTask() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                if (j > 0 && i < 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("*");
        }
    }

    public void fifthTask() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (i != j && i > 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("*");
        }
    }
}

