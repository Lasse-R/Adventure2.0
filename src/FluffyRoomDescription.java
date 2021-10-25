import java.util.Random;

public class FluffyRoomDescription {
    Random random = new Random();
    private String[] color = {"blue", "green", "yellow", "purple", "red", "dark", "pink", "black"};
    private String[] areaType = {"in a cave", "in a dark pit", "trying to peer into a heavy fog", "in a grotto",
            "looking over a lake", "too close for comfort to a pool of lava", "in a muddy area",
            "on a stone chess board floor", "just next to a huge crack in the floor", "on a narrow trail",
            "in a small hallway", "staring at a huge tree", "in a huge cavern", "in a small complete square area"};
    private String[] action = {"hanging from the ceiling", "raining down from above", "slowly," +
            " very slowly moving towards you", "growing on the walls", "floating mysteriously in the air",
            "swinging from outcroppings near the ceiling", "giving the impression of watching you", "jumping up and down",
            "appearing and disappearing at random"};
    private String[] decoration = {"mushrooms", "fungus", "rocks", "skulls", "sticky webs", "icy spirals",
            "plants", "shining stars", "glowing stones", "glassy bulbs", "eggs", "eyes"};

    private String[] roomNames = {" cave.", " grotto.", " room.", " hollow.", " tunnel.", " dug-out.",
            " chamber", " cavity.", " gallery"};
    private String[] roomDescriptor = {"The bloody", "The hollow", "The chilly", "The harsh", "The still",
            "The turbulent", "The small", "The deathly", "The tiresome", "The gross", "The stale",
            "The mushy", "The stinky", "The citrussy", "The disturbing", "The creepy", "The deep"};

    public void setColor(String[] color){
        this.color = color;
    }

    public void FluffyDescriptions(){    }

    public String roomDescription(){
        return "You stand " + areaType[random.nextInt(areaType.length)] + ", where " + color[random.nextInt(color.length)] +
                " " + decoration[random.nextInt(decoration.length)] + " are " + action[random.nextInt(action.length)] + ".";
    }
    public String roomName(){
        return roomDescriptor[random.nextInt(roomDescriptor.length)] + roomNames[random.nextInt(roomNames.length)];
    }
}
