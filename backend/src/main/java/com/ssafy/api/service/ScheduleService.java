package com.ssafy.api.service;

import com.ssafy.api.request.SurveyRegistReq;
import com.ssafy.api.response.PlaceDetailRes;
import com.ssafy.api.response.SearchPlaceRes;
import com.ssafy.api.request.ScheduleRegistReq;
import com.ssafy.api.response.JejuPlaceRes;
import com.ssafy.api.response.ScheduleThumbnailRes;

import java.util.LinkedHashMap;
import java.util.List;

public interface ScheduleService {
    public List<SearchPlaceRes> getserarchPlace(String keyword);
    List<SearchPlaceRes> getserarchPlace();
    public PlaceDetailRes getPlaceDetail(int jejuPlaceId);
    List<ScheduleThumbnailRes> getScheduleThumbnail();
    void registSchedule(ScheduleRegistReq scheduleRegistReq);
    LinkedHashMap<String, List<JejuPlaceRes>> getRecommendJejuPlace(int surveyId);
}
