package com.controller.controllerPackage2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.controller.entity.IssueReport;

@Controller
public class IssueController {

	@GetMapping("/issuereport")
	public String getReport(Model model) {
		model.addAttribute("issuereport", new IssueReport());
		return "issues/issuereport_form";
	}

	@PostMapping(value = "/issuereport")
	public String submitReport(IssueReport issueReport, Model model) {
		model.addAttribute("issuereport", new IssueReport());
		model.addAttribute("submitted", true);
		return "issues/issuereport_form";
	}

	@GetMapping("/issues")
	public String getIssues(Model model) {
		return "issues/issuereport_list";
	}
}
