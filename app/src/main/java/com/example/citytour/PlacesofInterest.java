package com.example.citytour;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlacesofInterest extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<Places> places=new ArrayList<>();

        places.add(new Places(R.drawable.ganga_dolphin,"Vikramshila Gangetic Dolphin Sanctuary","Vikramshila " +
                "Gangetic Dolphin Sanctuary is located in Bhagalpur District of Bihar, India." +
                " The sanctuary is a 60 km stretch of the Ganges River from Sultanganj to Kahalgaon in Bhagalpur District." +
                " Designated in 1991, it is protected area for the endangered Gangetic dolphins in Asia. Once found in abundance," +
                " only a few hundred remain, of which half are found here.\n" +
                "\n" +
                "The Gangetic dolphins have been declared as the national aquatic animal of India." +
                " This decision was taken in the first meeting of the National Ganga River Basin Authority (NGRBA)" +
                " chaired by Prime Minister Dr. Manmohan Singh on Monday, 5 October 2009"+
                "Major attractions are the Ganges river dolphins (known as Soons by Locals) " +
                "which are classified as endangered on the 2006 IUCN Red List of Threatened Species and included in Schedule-I " +
                "of the Indian Wildlife Protection Act, 1972. The sanctuary also contains rich diversity " +
                "of other threatened aquatic wildlife, including the Indian smooth-coated otter (Lutrogale perspicillata), " +
                "gharial (Gavialis gangeticus), a variety of freshwater turtles, and 135 species of waterfowl"));

        places.add(new Places(R.drawable.mandar_mount,"Mandar Hill:" ,
                "Mandar Hills (50 km), steeped in legend and laced with landscape of extraordinary splendour " +
                "exposes the 800 feet high granite hill. Mandar is associated with amritmanthana which suggests" +
                " that the hill was used by the gods to churn the ocean to procure amrit. The serpent, " +
                "Basukinaga offered to serve as the rope and has left behind an impression of the coil on the granite hill." +
                " It is believed that panchjanya, the conch shell used in Mahabharat War was discovered here in the Sank kund. " +
                "The puranas refer to various sacred places on the hill which is also believed to be the abode of" +
                " Vishnu under the title of Madhusudana or the destroyer of a demon called Madhu" +
                " who was killed by Vishnu and then covered by the Mandar hill. Kalidasa’s kumarasamahava " +
                "refers to foot marks of Vishnu on the slopes of Mandar.The hill is replete with relics of bygone ages." +
                " Besides inscriptions and statues there are numerous rock cut sculptures depicting " +
                "various Brahmanical images. The hill is equally revered by the Jains who" +
                " believe that their 12th Tirthankara attained nirvana here on the summit of the hill."));

        places.add(new Places(R.drawable.vikramshila_stupa,"Ruins of Vikramshila:","The royal university" +
                " of Vikramsila, " +
                "38 km from Bhagalpur ranks next to Nalanda and owes its origin to Dharmapala (770-810 A.D.), the devout Pala king who" +
                " loved to call himself Paramasaugata (chief worshipper of the Buddha)and was a great patron of Mahayana " +
                "Buddhism.Dharmapala was impressed by two things which prompted him to establish Vikramsila university." +
                " Firstly, the rocky hillock anchored around the confluence of Kosi and Ganga at Vateshwarasthan " +
                "was not only a scenic attraction but a popular tantric site as evident from the presence of a " +
                "Kali temple (instead of Parvati’s) in front of Shiva temple, besides various other caves and " +
                "rock cut sculptures dating back to the 6\\7th century A.D. Secondly, the place was " +
                " with pilgrimage due to Uttarbahini which drew large crowds during Varsavardhana." +
                "Unlike Nalanda, sources of information on Vikramsila is confined to Tibetan texts and " +
                "they make us believe that Dharmapala in his earlier birth was an accomplished acharya," +
                " Kampilya, who had attained siddhi or perfection in Mahayana mudra mysticism here and " +
                "was determined to build a monastery one day."));


        places.add(new Places(R.drawable.lord_vasupujya,"Shri Champapur Digamber Jain Siddha Kshetra:","Shri Champapur Digamber Jain Siddha Kshetra " +
                "is an Siddha Kshetra (Place of Salvation). It is quite an ancient and historic Teerth Kshetra." +
                " Shri Champapur Digamber Jain Siddha Kshetra is located at village Nathnagar, District Bhagalpur Bihar. " +
                "By road it is 3.5 km away from Bhagalpur, 270 Km. Patna. Champapur is the only" +
                " ‘Panch Kalyanaka Kshetra’ in the world which is related to Panch Kalyanaka: – " +
                "“(i) Garbha, (ii) Janma, (iii) Tapa, (iv) Gyan and (v) Moksha” of " +
                "12th Tirthankara Bhagwan Vasupujya (The first ascetic saint)."));

        places.add(new Places(R.drawable.kuppaghat_ashram,"Maharshi Mehi Aashram, Kuppaghat:","Lord Sadguru" +
                " Maharshi Mehi Paramhansji Maharaj was a Sant in the link of Sants like Kabir and Nanak. " +
                "He had attained perfection and was a God-realized Soul." +
                " His spirit-force was ever absorbed in the Logos and He was endowed with all the marks of a Sant."));

        places.add(new Places(R.drawable.greater_adjutant,"Garuda sanctuary","World's Second Largest Rescue " +
                "and Rehabilitation Area for Garuda is Bhagalpur. In Indian mythology, Garuda is considered the vahana" +
                " or carrier of the god Vishnu. The mythical Garuda is staging a comeback – only this time in reality. " +
                "Four years after these endangered birds of the stork family started nesting and breeding in Bhagalpur district," +
                " their number has increased over sixfold – from 78 to over 500.[6] Worldwide its population is about 1200–1300." +
                " They live in only three places; one is Cambodia and other two are in India. " +
                "In Cambodia, the garuda population is about 150, in Assam the garuda population is about 650, " +
                "and in the Bhagalpur district (around Kadwa Diyara, a place nearby Naugachia) the garuda population is about 500."));

        places.add(new Places(R.drawable.vikramshila_setu,"Vikramshila Setu","Vikramshila Setu is 5th longest " +
                "bridge over water in India. The 4.7 km long two lane bridge serves as a link between NH 33 and" +
                " NH 31 running on the opposite sides of the Ganges. This bridge has reduced considerably the " +
                "road travel between Bhagalpur and places across the Ganges, like Darjeeling, Siliguri, Assam etc. " +
                "Before the opening of this bridge steamer was being used for transportation across the Ganga river."));

        PlacesAdapter adapter=new PlacesAdapter(this,places);

        ListView listView=findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }
}
