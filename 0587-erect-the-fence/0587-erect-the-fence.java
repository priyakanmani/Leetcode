class Solution {
    public int isGreater(int a[],int b[],int c[]){
        return ((b[0]-a[0])*(c[1]-a[1])-(c[0]-a[0])*(b[1]-a[1])); //slope formula transformed version
        // slope=y2-y1/x2-x1 so we are comapring slope of 2 different line where first line is a to b second is a to c so if slope of a to c is greater here +ve number will get returned
    }
    public int[][] outerTrees(int[][] trees) {
        Arrays.sort(trees,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        ArrayList<int[]> upper=new ArrayList<>();
        ArrayList<int[]> lower=new ArrayList<>();
        HashSet<int[]> result=new HashSet<>();
        // fense will connect the first tree with highest treee and  highest lastlowest and lastlowest to bottom highest or lowest forming a barfi aur rohmbus shape
        for(int i=0;i<trees.length;i++){
            int lastUpper=upper.size()-1;
            int lastLower=lower.size()-1;
            //upper fense or hull
            //if the current tree is at highest rest all will be removed  except firstand this will be addded
            while(upper.size()>=2 && isGreater(upper.get(lastUpper-1),upper.get(lastUpper),trees[i])>0){
                 upper.remove(lastUpper);
                 lastUpper--;
            }
            //lower fense or hull
            //if current tree is at lowest then rest all will be removed  except first and this will be added
            while(lower.size()>=2 && isGreater(lower.get(lastLower-1),lower.get(lastLower),trees[i])<0){
                lower.remove(lastLower);
                lastLower--;
            }
            //adding the current highest and lowest tree
            upper.add(trees[i]);
            lower.add(trees[i]);
        }
        result.addAll(lower);
        result.addAll(upper);
        return result.toArray(new int[result.size()][]);
    }
}