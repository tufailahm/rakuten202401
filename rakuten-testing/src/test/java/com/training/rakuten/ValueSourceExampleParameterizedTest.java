package com.training.rakuten;
 
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource; 
  
class ValueSourceExampleParameterizedTest { 
  
    private final PhoneValidationService phoneValidationService = new TestPhoneValidationService(); 
  
    @ParameterizedTest
    @ValueSource(strings = {"555 555 95 55", "5555555555", "+15555555555"}) 
    void testProcessValidPhones(String phone) { 
        assertTrue(phoneValidationService.validatePhone(phone)); 
    } 
  
    @ParameterizedTest
    @ValueSource(strings = {"555", "@+15555555555", "test"}) 
    void testProcessInvalidPhones(String phone) { 
        assertFalse(phoneValidationService.validatePhone(phone)); 
    } 
    
}