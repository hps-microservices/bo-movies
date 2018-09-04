package com.msvvdv.bomoviescore.service;

public interface SequenceService {
    long getNextSequenceId(String key) throws SecurityException;
}
