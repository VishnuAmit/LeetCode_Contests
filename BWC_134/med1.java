// Problem link: https://leetcode.com/problems/maximum-points-after-enemy-battles/
class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        int n=enemyEnergies.length;
        Arrays.sort(enemyEnergies);
        if(currentEnergy<enemyEnergies[0]) return 0;
        long totale=currentEnergy;
        for(int i=n-1;i>0;i--){
            totale+=enemyEnergies[i];
        }
        return totale/enemyEnergies[0];
    }
}