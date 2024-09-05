import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random r = new Random();
        int man;
        int woman;
        int child;

        man = r.nextInt(3) + 1;
        woman = r.nextInt(3) + 1;
        child = r.nextInt(3) + 1;

        if (man == 1) {
            if (woman == 1) {
                if (child == 1) {
                    System.out.println("あいこです");
                } else if (child == 2) {
                    System.out.println("childの勝ちです");
                } else if (child == 3) {
                    System.out.println("manとwomanの勝ちです");
                }
            }

            else if (woman == 2) {
                if (child == 1) {
                    System.out.println("womanの勝ちです");
                } else if (child == 2) {
                    System.out.println("womanとchildの勝ちです");
                } else if (child == 3) {
                    System.out.println("あいこです");
                }
            }

            else if (woman == 3) {
                if (child == 1) {
                    System.out.println("manとchildの勝ちです");
                } else if (child == 2) {
                    System.out.println("あいこです");
                } else if (child == 3) {
                    System.out.println("manの勝ちです");
                }
            }
        }

        else if (man == 2) {
            if (woman == 1) {
                if (child == 1) {
                    System.out.println("manの勝ちです");
                } else if (child == 2) {
                    System.out.println("manとchildの勝ちです");
                } else if (child == 3) {
                    System.out.println("あいこです");
                }
            }

            else if (woman == 2) {
                if (child == 1) {
                    System.out.println("manの勝ちです");
                } else if (child == 2) {
                    System.out.println("あいこです");
                } else if (child == 3) {
                    System.out.println("childの勝ちです");
                }
            }

            else if (woman == 3) {
                if (child == 1) {
                    System.out.println("あいこです");
                } else if (child == 2) {
                    System.out.println("womanの勝ちです");
                } else if (child == 3) {
                    System.out.println("womanとchildの勝ちです");
                }
            }

        }

        else if (man == 3) {
            if (woman == 1) {
                if (child == 1) {
                    System.out.println("womanとchildの勝ちです");
                } else if (child == 2) {
                    System.out.println("あいこです");
                } else if (child == 3) {
                    System.out.println("womanの勝ちです");
                }
            }

            else if (woman == 2) {
                if (child == 1) {
                    System.out.println("あいこです");
                } else if (child == 2) {
                    System.out.println("manの勝ちです");
                } else if (child == 3) {
                    System.out.println("manとchildの勝ちです");
                }
            }

            else if (woman == 3) {
                if (child == 1) {
                    System.out.println("childの勝ちです");
                } else if (child == 2) {
                    System.out.println("manとwomanの勝ちです");
                } else if (child == 3) {
                    System.out.println("あいこです");
                }
            }

        }

    }
}
