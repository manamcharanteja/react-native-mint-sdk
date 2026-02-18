module.exports = {
  dependency: {
    platforms: {
      android: {
        packageImportPath: 'import com.reactnativemintsdk.MintSdkPackage;',
        packageInstance: 'new MintSdkPackage()',
      },
      ios: {},
    },
  },
};
