//
//     Generated by class-dump 3.5 (64 bit).
//
//     class-dump is Copyright (C) 1997-1998, 2000-2001, 2004-2013 by Steve Nygard.
//

#import <XCTest/XCUIElementQuery.h>

@class XCElementSnapshot, XCUIApplication;

@interface XCApplicationQuery : XCUIElementQuery
{
    XCUIApplication *_application;
    XCElementSnapshot *_lastSnapshot;
}

@property(retain) XCElementSnapshot *lastSnapshot; // @synthesize lastSnapshot=_lastSnapshot;
- (id)matchingSnapshotsWithError:(id *)arg1;
- (id)application;
- (id)initWithApplication:(id)arg1;


@end
