package com.oscngl.design.patterns.facade;

public class EncryptionFacade {

    private final AESEncryption aesEncryption = new AESEncryption();
    private final MD5Encryption md5Encryption = new MD5Encryption();
    private final SHAEncryption shaEncryption = new SHAEncryption();

    public void encrypt(String text, EncType encType) {
        switch (encType) {
            case AES -> aesEncryption.encrypt(text);
            case MD5 -> md5Encryption.encrypt(text, "KEY");
            case SHA -> shaEncryption.encrypt(text, "KEY", false);
        }
    }

    public enum EncType {
        AES,
        MD5,
        SHA
    }

}
