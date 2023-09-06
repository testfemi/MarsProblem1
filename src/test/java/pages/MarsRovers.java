package pages;

public class MarsRovers {
    public static String moveRover(int x, int y, char direction, String instructions) {
        int dx, dy;
        char newDirection = direction;

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                switch (newDirection) {
                    case 'N':
                        newDirection = 'W';
                        break;
                    case 'E':
                        newDirection = 'N';
                        break;
                    case 'S':
                        newDirection = 'E';
                        break;
                    case 'W':
                        newDirection = 'S';
                        break;
                }
            } else if (instruction == 'R') {
                switch (newDirection) {
                    case 'N':
                        newDirection = 'E';
                        break;
                    case 'E':
                        newDirection = 'S';
                        break;
                    case 'S':
                        newDirection = 'W';
                        break;
                    case 'W':
                        newDirection = 'N';
                        break;
                }
            } else if (instruction == 'M') {
                switch (newDirection) {
                    case 'N':
                        dx = 0;
                        dy = 1;
                        break;
                    case 'E':
                        dx = 1;
                        dy = 0;
                        break;
                    case 'S':
                        dx = 0;
                        dy = -1;
                        break;
                    case 'W':
                        dx = -1;
                        dy = 0;
                        break;
                    default:
                        dx = 0;
                        dy = 0;
                        break;
                }
                x += dx;
                y += dy;
            }
        }

        return x + " " + y + " " + newDirection;
    }

    public static String moveRover(Integer x, Integer y) {
        return null;
    }
}