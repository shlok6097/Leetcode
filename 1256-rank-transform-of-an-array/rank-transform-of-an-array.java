class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[][] a = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0)
                    a[i][j] = arr[i];
                else
                    a[i][j] = i;
            }
        }

        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

        int[] ans = new int[arr.length];

        int i = 0;

        int rank = 1;

        while (i < arr.length) {
            if (  i<arr.length-1 && (a[i][0] != a[i + 1][0])) {

                ans[a[i][1]] = rank;

                rank++;

            } else {
                ans[a[i][1]] = rank;
            }
            i++;

        }

        return ans;

    }
}