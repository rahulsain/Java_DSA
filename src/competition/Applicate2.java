package competition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Applicate2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the name from the input
        String input_from_question = br.readLine();

        //Write your answer here

        // print the Output
        System.out.println(input_from_question);
    }

    class Entry {
        int outlet;
        int product;
        int priceAfterDiscount;

        Entry(int outlet, int product, int priceAfterDiscount) {
            this.outlet = outlet;
            this.product = product;
            this.priceAfterDiscount = priceAfterDiscount;
        }
    }

    class MaxDiscountSystem {
        ArrayList<Entry> entries;

        public MaxDiscountSystem(ArrayList<Entry> entries) {
            this.entries = entries;
        }

        public ArrayList<Integer> searchProduct(ArrayList<Integer> products) {
            ArrayList<Integer> bestOutlet = new ArrayList<>();
            int maxDiscount = 0;
            for (Integer product : products) {
                Entry entry = entries.get(product);
                if (entry.priceAfterDiscount > maxDiscount) {
                    maxDiscount = entry.priceAfterDiscount;
                    bestOutlet.clear();
                    bestOutlet.add(entry.outlet);
                } else if (entry.priceAfterDiscount == maxDiscount) {
                    bestOutlet.add(entry.outlet);
                }
            }
            return bestOutlet;
        }

        public ArrayList<Integer> generateReport(ArrayList<Integer> products) {
            ArrayList<Integer> bestOutlet = new ArrayList<>();
            return bestOutlet;
        }
    }
}
