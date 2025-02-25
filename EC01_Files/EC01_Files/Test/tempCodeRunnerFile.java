    public static void factorsOfTwoInFile(String inputFileName, String outputFileName)throws IOException
    {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
    
        try (Scanner scanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(outputFile)) {
            if (!scanner.hasNextInt()) {
                writer.println("No numbers found in the input file.");
                return;
            }
            while(scanner.hasNextInt()){
                int number = scanner.nextInt();
                StringBuilder result = new StringBuilder(number + " = ");
                if(number == 0){
                    writer.println("0 = 0");
                    continue;
                }
                boolean isNegative = number < 0;
                if(isNegative){
                    number = -number;
                }
                if(number % 2 == 1){
                    writer.println(number + " = " + number);
                    continue;
                }
                for (int i = 2; i <= number; i++) {
                    while (number % i == 0) {
                        result.append(i);
                        number /= i;
                        
                        if (number != 1) {
                            result.append(" * ");
                        }else if(isNegative && number / i == 1){
                            result.append("-");
                        }

                    }
  
                }
                
                writer.println(result.toString());
            } 
        }
    }