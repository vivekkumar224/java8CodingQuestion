package org.example.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YotubChannel implements Subject {

    List<Subcriber> subcribers=new ArrayList<>();
    String videos;


    public void addSubriber(Subcriber subcriber)
    {
        subcribers.add(subcriber);
    }
    public  void removeSubcriber(Subcriber subcriber)
    {
        subcribers.remove(subcriber);
    }


    @Override
    public void updateVideos(String videos) {
        this.videos=videos;

        notifySubscriber(videos);

    }

    private void notifySubscriber(String videos) {

        for(Subcriber subcriber:subcribers)
        {
            subcriber.GetVideos(videos,subcriber.getName());
        }


    }
}
