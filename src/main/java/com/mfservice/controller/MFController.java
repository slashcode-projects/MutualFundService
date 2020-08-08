package com.mfservice.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfservice.models.MutualFund;

@RestController
@RequestMapping("/MutualFundService")
public class MFController {

	@RequestMapping("/{mfId}")
	public MutualFund getMFById(@PathVariable("mfId") int mfId) {
		List<MutualFund> mfList = new ArrayList<MutualFund>();
		mfList.add(new MutualFund(1,"Mirae",11.5,5.6,"Hybrid"));
		mfList.add(new MutualFund(2,"DSP",15.5,7.6,"Equity"));
		mfList.add(new MutualFund(3,"Nippon",21.5,6.6,"Hybrid"));
		MutualFund mfdata = mfList.stream().filter(mf -> mfId == mf.getMfId()).findAny().orElse(null);
		return mfdata;
	}
}
