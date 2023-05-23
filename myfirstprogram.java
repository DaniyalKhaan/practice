 class myfirstprogram {
   
      public static void main(String[] args) {
        String[] animationFrames = {
            " _____     _____",
            "|     |   |     |",
            "| (o o)   | (o o)",
            "|   >     |  <  ",
            "|_____    |_____"
        };
    
        while (true) {
            for (String frame : animationFrames) {
                System.out.println(frame);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
      }
    
   }
    