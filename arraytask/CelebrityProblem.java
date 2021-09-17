
    package com.arraytask;

    public class CelebrityProblem {
        public static int knows(int i,int j,int[][] mat){
            return mat[i][j];
        }
        public static int findCelebrity(int[][] mat,int size){
            int[] inDegree=new int[size];
            int[] outDegree=new int[size];
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    int x=knows(i,j,mat);
                    outDegree[i]+=x;
                    inDegree[j]+=x;
                }
            }
            for(int i=0;i<size;i++){
                if(inDegree[i]==size-1&&outDegree[i]==0){
                    return i;
                }
            }
            return -1;
        }

    }

