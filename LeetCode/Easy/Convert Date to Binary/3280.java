class Solution {
    public String convertDateToBinary(String date) {
        String year = Integer.toString(Integer.parseInt(date.substring(0, 4)), 2);
        String month = Integer.toString(Integer.parseInt(date.substring(5, 7)), 2);
        String day = Integer.toString(Integer.parseInt(date.substring(8)), 2);
        return year + "-" + month + "-" + day;
    }
}
