/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let left=0,right=0;
    const h1=new Set();
    let Max=0;
    while(right<s.length)
    {
        if(!h1.has(s[right]))
        {
            h1.add(s[right]);
            Max=Math.max(Max,right-left+1);
            right++;
        }
        else
        {
            h1.delete(s[left]);
            left++;
        }
    }
    return Max;
};