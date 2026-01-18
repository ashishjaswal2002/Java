public class Test
{

    static void main(String[] args) {

        Smartphone xiaomi = new Smartphone();
        xiaomi.capture();

    }

}

class Camera{
    void capture(){
        System.out.println("Photo Capture");
    }
}

class MusicPlayer{
    void playMusic(){
        System.out.println("Music Playing");
    }
}
class Phone{
    void call(String number){
        System.out.println("Calling"+number);
    }
}
