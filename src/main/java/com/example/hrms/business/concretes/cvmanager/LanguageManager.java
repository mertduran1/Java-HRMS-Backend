package com.example.hrms.business.concretes.cvmanager;

import com.example.hrms.business.abstracts.candidatecv.LanguageService;
import com.example.hrms.business.abstracts.requests.CreateLanguageRequest;
import com.example.hrms.business.abstracts.responses.candidatecv.GetAllLanguagesResponse;
import com.example.hrms.core.utilities.mappers.ModelMapperService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.candidatecv.LanguageDao;
import com.example.hrms.entities.concretes.CandidateCV.Language;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    private LanguageDao languageDao;
    private ModelMapperService modelMapperService;

    @Override
    public Result add(List<CreateLanguageRequest> createLanguageRequests) {
        Language language = modelMapperService.forRequest().map(createLanguageRequests, Language.class);
        languageDao.save(language);
        return new SuccessResult("Language added");
    }

    @Override
    public DataResult<List<GetAllLanguagesResponse>> getAllLanguagesByCandidateId(int candidateId) {
        List<Language> languages = languageDao.findAllByCandidateId(candidateId);
        List<GetAllLanguagesResponse> getAllLanguagesResponses = languages.stream().map(language -> modelMapperService.forResponse().map(language, GetAllLanguagesResponse.class)).toList();
        return new SuccessDataResult<>(getAllLanguagesResponses);
    }
}
