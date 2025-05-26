

import java.util.Arrays;

    public class RobotDirections {

        public static int[] directions(String input)

        {

            int x=0, y=0 ;

            if(!input.contains(" "))

            {

                for(char ch: input.toUpperCase().toCharArray())

                {

                    switch (ch)

                    {

                        case 'U':

                            y++;

                            break;

                        case 'D':

                            y--;

                            break;

                        case 'R':

                            x++;

                            break;

                        case 'L':

                            x--;

                            break;

                        default:

                            System.out.println("invalid directions "+input);

                    }

                }

            }

            else

            {

                String[] split = input.split("\\s+");

                for (String instruction: split)

                {

                    int count = 1 ;

                    String direction = instruction ;

                    if(instruction.matches("\\d+x[A-Z]+"));

                    {

                        String[] xes = instruction.split("x");

                        count = Integer.parseInt(xes[0]);

                        direction = xes[1];

                    }

                    switch (direction) {

                        case "UP":

                        case "U":

                            y +=count ;

                            break;

                        case "DOWN":

                        case "D":

                            y -=count;

                            break;

                        case "RIGHT":

                        case "R":

                            x +=count ;

                            break;

                        case "LEFT":

                        case "L":

                            x -=count ;

                            break;

                        default:

                            System.out.println("Invalid directions " + instruction);

                    }

                }

            }

            return new int[]{x,y} ;

        }

        public static void main(String[] args) {

            String input = "UUU" ;

            int[] directions = directions(input);

            System.out.println(Arrays.toString(directions));

        }

    }



