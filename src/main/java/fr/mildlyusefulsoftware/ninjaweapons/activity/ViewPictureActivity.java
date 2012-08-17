package fr.mildlyusefulsoftware.ninjaweapons.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1501e3a04c0695";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.random-good-stuff.com/wp-content/uploads/2009/12/NinjaWeapons.jpg",
				"http://i112.photobucket.com/albums/n172/hunterpig/IMG_3476.jpg",
				"http://www.natashalarrybooks.com/wp-content/uploads/2012/05/ss12.gif",
				"http://cdn.uberreview.com/wp-content/uploads/cf63_ninja_weapons_phone_charms.jpg",
				"http://anglocatholicninjas.files.wordpress.com/2007/03/kusarigama1.jpg",
				"http://www.tbotech.com/blog/wp-content/uploads/2009/08/ninja_grappling_hook.jpg",
				"http://i176.photobucket.com/albums/w163/hunterwaef/ninja%20sets/ninjastars2.jpg",
				"http://i153.photobucket.com/albums/s216/phyreblade_blog/Weapons/Ninja%20Officer%20Sword/TS-ELTNINJA1.jpg",
				"http://www.darksteelreplica.com/images/P/Practical_Pro_Ninja_Katana_2.jpg",
				"http://asiancostume.net/wp-content/uploads/2010/09/Dragon-Ninja-Weapon-Backpack-300x300.jpg",
				"http://images.buyninjacostumes.com/ninja-fighting-knives.jpg",
				"http://medieval2.heavengames.com/m2tw/history/miscellaneous_history_folder/japanese_weapons_folder/kama.gif",
				"http://2.bp.blogspot.com/-K7nnKbnFkns/TdFmpoUjAzI/AAAAAAAAAgs/UjzhK7f6RtE/s1600/Ninja+Weapons+Shuriken+and+Kunai.gif",
				"http://www.karatemart.com/images/products/large/deluxe-ninja-weapons-pack.jpg",
				"http://bukeyashikidojo.com/images/tachi.jpg",
				"http://www.bo-jitsu.de/assets/images/kusarigama.jpg",
				"http://www.natashalarrybooks.com/wp-content/uploads/2012/05/waffen-bakuhatsugama.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500griff/T/340x340/C/FFFFFF/url/armes-ninja-ninja-shuko.jpg",
				"http://csimg.webmarchand.com/srv/FR/28003956freddyc/T/340x340/C/FFFFFF/url/collection-les-griffes-du.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500sai/T/340x340/C/FFFFFF/url/armes-ninja-ninja-saa-paire.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500spike/T/340x340/C/FFFFFF/url/armes-ninja-ninja-spike-darts.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500c101a/T/340x340/C/FFFFFF/url/armes-ninja-mini-kunaas.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500devil/T/340x340/C/FFFFFF/url/armes-ninja-devil-claw.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500spi/T/340x340/C/FFFFFF/url/armes-ninja-shurikens.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500fouet/T/340x340/C/FFFFFF/url/armes-ninja-ninja-whip.jpg",
				"http://csimg.webmarchand.com/srv/FR/28009500silver/T/340x340/C/FFFFFF/url/armes-ninja-silver-kunaa.jpg",
				"http://www.ninjagym.com/images/Naginata_Modern.jpg",
				"http://swords-usa.com/images/210754.jpg",
				"http://bestmartialartsnews.com/wp-content/uploads/2012/02/illegal-ninja-weapons-episode-300x249.jpg",
				"http://www.allninjagear.com/wp-content/uploads/2009/11/pic214.jpg",
				"http://www.bladerealms.com/Ninja/Ninja_Weapons/Shoge_Hook-VL-0220105.gif",
				"http://images3.makefive.com/images/sports/combat/top-5-coolest-weapons/shuriken-ninja-throwing-stars-7.jpg",
				"http://static.redditgifts.com/images/uploaded/large-present/ninja-weapons/nin.JPG",
				"http://ninjaweaponlist.com/img/ninja-shikomizue.jpg",
				"http://www.bubishi.com.au/shop/images/weapons/ninjaweaponheader.jpg",
				"http://www.heavenlyswords.com/images/P/HK9001.",
				"http://i153.photobucket.com/albums/s216/phyreblade_blog/Weapons/Ninjato/NinjaKatana-PolishedChrome.jpg",
				"http://img.ehowcdn.com/article-new/ds-photo/getty/article/56/5/87631135.jpg",
				"http://cdn.costumediscounters.com/csc_inc/images/items/480x600/ATC00351314.jpg",
				"http://4.bp.blogspot.com/-wEiBLDBfogc/Tdors5HLFWI/AAAAAAAAAy8/ksSEzaSOFvE/s1600/Ninja-to+3.jpg",
				"http://www.darksteelreplica.com/images/D/Masahiro_Dragon_Ninja_Sword_3.jpg"
				
				
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("ninjaweapons",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
