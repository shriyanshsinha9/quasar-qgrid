class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        Collections.sort(arr);
        int k = list.size();
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<k; j++){
                list.add(list.get(j)+arr.get(i));
            }
            k = list.size();
        }
        Collections.sort(list);
        return list;
    }
}
