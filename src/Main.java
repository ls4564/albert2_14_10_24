public class Main {
    public static void main(String[] args)
    {
        Playable[] arr_Playable = new Playable[3];
        arr_Playable[0] = (new Drum());
        arr_Playable[1] = (new Piano());
        arr_Playable[2] = (new Guitar());

        for(Playable p :arr_Playable)
        {
            p.play();
        }
    }
}