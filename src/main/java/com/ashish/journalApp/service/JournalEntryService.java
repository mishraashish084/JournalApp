package com.ashish.journalApp.service;

import com.ashish.journalApp.entity.JournalEntry;
import com.ashish.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalEntryRepo;
public void saveEntry(JournalEntry journalEntry)
{
    journalEntryRepo.save(journalEntry);
}
}
