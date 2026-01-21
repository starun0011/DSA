class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int peak = arr[1], l = arr[0];
        int i = 1;
        boolean isMount = false, isInc = true, isDec = false; //9 2 3 4 2 5 2 0
        while (i < arr.length) {
            if (isInc) {
                if (arr[i] > l) {
                    peak = arr[i];
                    l = arr[i];
                    isInc = true;
                } else {
                    isInc = false;
                }
            }
            if (isInc == false) {
                if (arr[i] < peak && arr[i] < l) {
                    l = arr[i];
                    isMount = true;
                } else {
                    return false;
                }
            }
            i++;
        }

        return isMount;

    }
}