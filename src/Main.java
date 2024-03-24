// NO 1
//public class Main {
    // check kilobyte and Mega byte
//    public static String calculateKilobyteandMegabyte(int KilobyteandMegabyte) {
//        if (KilobyteandMegabyte > 2500){
//            return "2MB and 452KB";
//        } else if (KilobyteandMegabyte < 0) {
//            return "Invalid Value" ;
//        } if (KilobyteandMegabyte > 5000) {
//            return "4MB and 904KB" ;
//        }
//        return "4MB and 904";
//    }
//    public static void main(String[] args) {

//        System.out.println(calculateKilobyteandMegabyte(3000)); // Should print "2MB and 952KB"
//        System.out.println(calculateKilobyteandMegabyte(-100)); // Should print "5MB and 1024B"
//        System.out.println(calculateKilobyteandMegabyte(0)); // Should print "Invalid Value"
//    }
//    }
    // No 2
    public class Main {
        public static boolean hasEqualSum(int num1, int num2, int sum) {
            return (num1 + num2) == sum;
        }

        public static void main(String[] args) {
            System.out.println(hasEqualSum(1, 1, 1));
            System.out.println(hasEqualSum(1, 1, 2));
            System.out.println(hasEqualSum(1, -1, 0));
        }
    }

    

