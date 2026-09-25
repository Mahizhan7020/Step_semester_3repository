class Scorecard {
    private boolean[] answers;
    private int count;
    Scorecard(int total){
        answers=new boolean[total];
        count=0;
    }
    public void recordAnswer(boolean correct){
        if(count<answers.length) answers[count++]=correct;
    }
    public int getScore(){
        int score=0;
        for(int i=0;i<count;i++) if(answers[i]) score++;
        return score;
    }
}
