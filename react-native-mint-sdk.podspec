Pod::Spec.new do |s|
  s.name         = "react-native-mint-sdk"
  s.version      = "1.0.0"
  s.summary      = "React Native bridge for Mint SDK"
  s.homepage     = "https://github.com/example/react-native-mint-sdk"
  s.license      = "MIT"
  s.author       = "Mint"
  s.source       = { :git => "https://github.com/example/react-native-mint-sdk.git", :tag => s.version }
  s.platform     = :ios, "13.4"

  s.source_files = "ios/**/*.{h,m,mm,swift}"

  s.dependency "React-Core"
end
