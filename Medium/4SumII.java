class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
       
    /*
        Take the arrays A and B, and compute all the possible sums of two elements. Put the sum in the Hash map, and increase the hash map value if more than 1 pair sums to the same value.

        Compute all the possible sums of the arrays C and D. If hash map contains the OPPOSITE value of the current sum, increase the count by the counter in the map
    */
            
        Map<Integer, Integer> map = new HashMap<>();
    
        for(int i=0; i < A.length; i++) 
            for(int j=0; j < B.length; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        
        int count = 0;
        for(int i=0; i < C.length; i++) 
            for(int j=0; j < D.length; j++) 
                count += map.getOrDefault( -(C[i] + D[j]), 0);

        return count;
    }
}



Given the data,one may prefer decimal scaling for normalization as such a transformation would maintain the data distribution and beintuitivetointerpret,while still allowing miningon specifica g egroups.Min-maxnormalizatio nhas the undesired effect ofnotpermittinganyfuturevaluestofalloutsidethecurrentminimumandmaximumvalueswithoutencounteringan“out ofboundserror”.Asitisprobablethatsuchvaluesmaybepresentinfuturedata,thismethod islessappropriate.Also,z-scorenormalizationtransformsvaluesintomeasuresthatrepresenttheirdistancefromthemean,intermsofstandarddeviations.Itisprobablethatthistypeoftransformationwouldnotincreasetheinformationvalueoftheattributeintermsofintuitivenesstousersorinusefulnessofminingresults