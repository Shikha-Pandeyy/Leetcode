class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] res = new int[n];

        for(int i = 0; i < bookings.length; i++) {

            int first = bookings[i][0];
            int last  = bookings[i][1];
            int seats = bookings[i][2];

            while(last >= first) {
                res[last - 1] += seats;
                last--;
            }
        }

        return res;
    }
}