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

        PlacesAdapter adapter=new PlacesAdapter(this,places);

        ListView listView=findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }
}
