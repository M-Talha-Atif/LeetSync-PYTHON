class Solution {

    public int calPoints(String[] operations) {

        Stack<Integer> scores = new Stack<>();

        for (String operation : operations) {

            switch (operation) {

                case "C":

                    scores.pop();
                    break;

                case "D":

                    scores.push(scores.peek() * 2);
                    break;

                case "+":

                    int last = scores.pop();
                    int secondLast = scores.peek();

                    scores.push(last);
                    scores.push(last + secondLast);

                    break;

                default:

                    scores.push(Integer.parseInt(operation));
            }
        }

        int total = 0;

        while (!scores.isEmpty())
            total += scores.pop();

        return total;
    }
}