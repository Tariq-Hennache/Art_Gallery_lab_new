package art_gallery;

import java.util.ArrayList;

public class Gallery {
    private String name;
    private Double till;
    private ArrayList<Artwork> artwork;
    // private HashMap<String, Double> artworkCollection = new HashMap<>();

    public Gallery(){
        this.artwork = new ArrayList<Artwork>();
        this.name = "Art Palace";
        this.till = 0.0;
        // artworkCollection.put("Artist: Fred Smith, Artwork: The Weeping Widow, nft: qqwweerrttyy", 350.0);
    }


    public Double getTill(){
        return till;
    }

    //public void takePayment(Double payment) {
    //    till += payment;
    //}

    public Integer takePay(){
        return 350;
    }


    public Integer getPrice(){
        return 350;
    }







    // Double artworkPrice = artworkCollection.get("Artist: Fred Smith, Artwork: The Weeping Widow, nft: qqwweerrttyy");

    // public Double getArtworkPrice(){
    //    return artworkPrice;
    // }






}
